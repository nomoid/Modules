package com.github.assisstion.ModulePack.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * A final class with only one private constructor
 * that is never called, and contains only static
 * methods and fields
 *
 * @author Markus Feng
 */
@Documented
@Target(ElementType.TYPE)
@CompileVersion(JavaVersion.V1_5) // Annotation
public @interface Helper{

}
