package org.tensorflow.lite.examples.transfer;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Constants {
    public static final int NUM_CLASSES = 4;
    public static final List<String> CLASSES_LIST = IntStream.range(0, NUM_CLASSES).boxed().map(i -> String.valueOf(i + 1))
            .collect(Collectors.toList());
}
