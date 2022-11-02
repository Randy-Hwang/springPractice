package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository;
    // 인터페이스인 discountPolicy 뿐만아니라 구현체인 Fix/RateDiscountPolicy까지 의존하고 있음. DIP 위반
    // 추상에만 의존해야 하는데 구체(구현체)까지 의존하고 있음
    // 따라서, 의존관계를 변경하는 과정에서 클라이언트의 코드를 변경해야함 -> OCP위반
    //  private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    //  private final DiscountPolicy discountPolicy = new RateDiscountPolicy();
    // 아래와 같이 고칠것

    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

    // for the test
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
