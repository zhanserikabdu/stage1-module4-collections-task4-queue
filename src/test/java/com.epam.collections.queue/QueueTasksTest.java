package com.epam.collections.queue;

import org.junit.Test;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class QueueTasksTest {

    @Test
    public void testTask1() {
        Task1 task1 = new Task1();
        String actual = task1.getWeekDaysQueue();
        String expected = "Friday Monday Saturday Tuesday Thursday Wednesday Sunday";

        assertEquals(expected, actual);
    }

    @Test
    public void testTask2() {
        Task2 task2 = new Task2();
        Queue<String> originalQueue = new PriorityQueue<String>();
        originalQueue.add("One");
        originalQueue.add("Two");
        originalQueue.add("Three");

        Queue<String> actual = task2.copyQueue(originalQueue);
        assertNotEquals(actual, originalQueue);
        while (!actual.isEmpty()) {
            assertEquals(actual.poll(), originalQueue.poll());
        }
    }

    @Test
    public void testTask3() {
        Task3 task3 = new Task3();
        Queue<String> originalQueue = new PriorityQueue<String>();
        originalQueue.add("Four");
        originalQueue.add("Five");
        originalQueue.add("Six");

        List<String> actual = task3.convertToList(originalQueue);
        for (String value : actual) {
            assertEquals(value, originalQueue.poll());
        }
    }
}
