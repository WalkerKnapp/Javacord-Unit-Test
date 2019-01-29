package org.javacord.unittest.util.logging;

import org.javacord.api.util.logging.internal.ExceptionLoggerDelegate;

import java.util.Collection;
import java.util.function.Function;
import java.util.function.Predicate;

public class ExceptionLoggerDelegateImpl implements ExceptionLoggerDelegate {
    @Override
    public <T> Function<Throwable, T> get(Predicate<Throwable> logFilter, Collection<Class<? extends Throwable>> ignoredThrowableTypes, StackTraceElement[] stackTrace) {
        return null;
    }

    @Override
    public Thread.UncaughtExceptionHandler getUncaughtExceptionHandler() {
        return null;
    }
}
