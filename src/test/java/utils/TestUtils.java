package utils;

import org.jeasy.random.EasyRandom;
import org.jeasy.random.EasyRandomParameters;

/**
 * A utility class that provides a convenient way to generate random instances of objects using the
 * EasyRandom library. This class acts as syntactic sugar to simplify the use of EasyRandom in test
 * cases, especially when building test objects through builders.
 *
 * <p>The class is configured with specific EasyRandom parameters, including:
 *
 * <ul>
 *   <li>Scanning the classpath for concrete types to instantiate.
 * </ul>
 *
 * <p>Example usage:
 *
 * <pre>{@code
 * // Generate a random instance of a class
 * MyClass myObject = TestUtils.randomInstance(MyClass.class);
 * }</pre>
 */
public class TestUtils {

  private static final EasyRandomParameters parameters =
      new EasyRandomParameters().scanClasspathForConcreteTypes(true);
  private static final EasyRandom generator = new EasyRandom(parameters);

  /**
   * Generates a random instance of the specified class using the EasyRandom library.
   *
   * @param <T> the type of the object to generate
   * @param clazz the class of the object to generate
   * @return a randomly populated instance of the specified class
   */
  public static <T> T randomInstance(Class<T> clazz) {
    return generator.nextObject(clazz);
  }
}
