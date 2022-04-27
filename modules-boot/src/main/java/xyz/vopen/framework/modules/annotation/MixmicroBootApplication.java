package xyz.vopen.framework.modules.annotation;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * {@link MixmicroBootApplication} Definition
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2022/4/27
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Configuration
@SpringBootApplication
public @interface MixmicroBootApplication {

  /**
   * Module Name Defined
   */
  String name() default "";

  /**
   * Parent Module Name Support
   */
  String parent() default "";

  /**
   * Server Port
   */
  int httpPort() default 0;

  /**
   * Startup Order Defined
   * <p>Default: 0</p>
   */
  int order() default 0;

}
