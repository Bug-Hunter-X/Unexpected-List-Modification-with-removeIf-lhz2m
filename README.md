# Kotlin `removeIf` Gotcha

This example demonstrates a subtle issue that can arise when using Kotlin's `removeIf` function with mutable lists. The problem lies in how `removeIf` modifies the list *in place* while iterating. This can cause unexpected behavior if the condition within `removeIf` depends on the current state of the list.

The example code showcases a scenario where even numbers are removed from a list.  While seemingly straightforward, the code might not produce the expected result because the index of elements changes as elements are removed.

The solution demonstrates safer ways to handle this kind of operation.