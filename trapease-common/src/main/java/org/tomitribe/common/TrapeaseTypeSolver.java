package org.tomitribe.common;

import com.github.javaparser.symbolsolver.resolution.typesolvers.CombinedTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.JavaParserTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.ReflectionTypeSolver;

import java.io.File;

public class TrapeaseTypeSolver {

    private static CombinedTypeSolver combinedTypeSolver = new CombinedTypeSolver();

    public static void init() {
        combinedTypeSolver.add(new ReflectionTypeSolver());
        combinedTypeSolver.add(new JavaParserTypeSolver(new File(Configuration.MODEL_SOURCES)));
        combinedTypeSolver.add(new JavaParserTypeSolver(new File(Configuration.RESOURCE_SOURCES)));
        combinedTypeSolver.add(new JavaParserTypeSolver(new File(Configuration.GENERATED_SOURCES)));
    }

    public static CombinedTypeSolver get() {
        return combinedTypeSolver;
    }
}