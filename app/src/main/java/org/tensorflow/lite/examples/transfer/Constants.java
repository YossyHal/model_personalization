package org.tensorflow.lite.examples.transfer;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Constants {
    public static final int NUM_CLASSES = 5;
    public static final List<String> CLASSES_LIST = IntStream.range(0, NUM_CLASSES).boxed().map(i -> String.valueOf(i + 1))
            .collect(Collectors.toList());
    public static final String ASSETS_MODEL_NAME=String.format("mobilenet_softmax_model_%d_classes",NUM_CLASSES);
}
