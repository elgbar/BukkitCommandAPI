package com.not2excel.api.command;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author karl henrik
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Flag {

    /**
     * If the char is '*' (asterisk) then this character will be used as a select
     * everything flag.
     *
     * @return The character to use for this flag.
     */
    char flag();

    /**
     * @return An explanation of what this flag does.
     */
    String usage();

    /**
     * @return The permission needed to run the command with this flag.
     */
    String permission() default "";

    /**
     * @return Message to send to CommandSender if they do not have permission to use this flag
     */
    String noPermission() default "You don't have permission use this flag.";

}
