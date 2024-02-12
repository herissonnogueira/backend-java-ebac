package anotacao;

import java.lang.annotation.*;

/**
 * @author herisson.nogueira
 */

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}
