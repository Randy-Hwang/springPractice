package hello.core.scan.filter;

import java.lang.annotation.*;

// 얘가 붙은 클래스는 컴포넌트에 추가할 예정이다
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyIncludeComponent {

}
