package com.felipemg.celebrity;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class CelebrityTest {

    @Test
    public void partyWithCelebrityInPosition0ShouldReturn0(){
        int N = 2;
        int[][] matrix = {{0,0},{1,0}};
        assertThat(Celebrity.findCelebrity(N,matrix), is(0));
    }

    @Test
    public void partyWithCelebrityInPosition2ShouldReturn2(){
        int N = 4;
        int[][] matrix = {{0,0,1,0},{0,0,1,0},{0,0,0,0},{0,0,1,0}};
        assertThat(Celebrity.findCelebrity(N,matrix), is(2));
    }

    @Test
    public void partyWithoutCelebrityShouldReturnMinus1(){
        int N = 4;
        int[][] matrix = {{0,0,1,0},{0,0,1,0},{0,1,0,0},{0,0,1,0}};
        assertThat(Celebrity.findCelebrity(N,matrix), is(-1));
    }
}
