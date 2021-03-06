package com.nishant.algorithms.Math.Matrices;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {
    private Matrix mat1, mat2;

    @Test
    public void creationTest() {
        mat1 =
                new Matrix(
                        new double[][]{
                                {-1, 0, 1},
                                {0, 1, 1},
                                {-1, -1, 1}
                        });
        assertArrayEquals(
                new double[][]{
                        {-1, 0, 1},
                        {0, 1, 1},
                        {-1, -1, 1}
                },
                mat1.matrix);
    }

    @Test
    public void addTest() {
        mat1 =
                new com.nishant.algorithms.Math.Matrices.Matrix(
                        new double[][]{
                                {0, 1, 2},
                                {3, 4, 5},
                        });
        mat2 =
                new com.nishant.algorithms.Math.Matrices.Matrix(
                        new double[][]{
                                {0, 3, 6},
                                {9, 12, 15},
                        });

        com.nishant.algorithms.Math.Matrices.Matrix res = mat1.add(mat2);
        assertEquals(
                new com.nishant.algorithms.Math.Matrices.Matrix(
                        new double[][]{
                                {0, 4, 8},
                                {12, 16, 20},
                        }),
                res);
    }

    @Test
    public void equalsTest() {
        mat1 =
                new com.nishant.algorithms.Math.Matrices.Matrix(
                        new double[][]{
                                {0, 0, 0},
                                {0, 0, 0},
                                {0, 0, 0}
                        });
        mat2 =
                new com.nishant.algorithms.Math.Matrices.Matrix(
                        new double[][]{
                                {0, 0, 0},
                                {0, 0, 0},
                                {0, 0, 0}
                        });
        assertEquals(mat1, mat2);
    }

    @Test
    public void scalarMultTest() {
        mat1 =
                new com.nishant.algorithms.Math.Matrices.Matrix(
                        new double[][]{
                                {0, 1, 2},
                                {3, 4, 5},
                                {6, 7, 8}
                        });
        com.nishant.algorithms.Math.Matrices.Matrix res = mat1.multiply(3);
        assertEquals(
                new com.nishant.algorithms.Math.Matrices.Matrix(
                        new double[][]{
                                {0, 3, 6},
                                {9, 12, 15},
                                {18, 21, 24}
                        }),
                res);
    }

    @Test
    public void matrixMultTest() {
        mat1 =
                new com.nishant.algorithms.Math.Matrices.Matrix(
                        new double[][]{
                                {1, 2, 3},
                                {4, 5, 6}
                        });
        mat2 =
                new com.nishant.algorithms.Math.Matrices.Matrix(
                        new double[][]{
                                {7, 8},
                                {9, 10},
                                {11, 12}
                        });
        com.nishant.algorithms.Math.Matrices.Matrix res = mat1.multiply(mat2);
        assertEquals(
                new com.nishant.algorithms.Math.Matrices.Matrix(
                        new double[][]{
                                {58, 64},
                                {139, 154}
                        }),
                res);
    }

    @Test
    public void transpositionTest() {
        mat1 =
                new com.nishant.algorithms.Math.Matrices.Matrix(
                        new double[][]{
                                {1, 2, 3},
                                {4, 5, 6}
                        });
        com.nishant.algorithms.Math.Matrices.Matrix res = mat1.transpose();
        assertEquals(
                new com.nishant.algorithms.Math.Matrices.Matrix(
                        new double[][]{
                                {1, 4},
                                {2, 5},
                                {3, 6}
                        }),
                res);
    }

    @Test
    public void identityTest() {
        mat1 = com.nishant.algorithms.Math.Matrices.Matrix.identity(3);
        assertEquals(
                new com.nishant.algorithms.Math.Matrices.Matrix(
                        new double[][]{
                                {1, 0, 0},
                                {0, 1, 0},
                                {0, 0, 1}
                        }),
                mat1);
    }

    @Test
    public void getRowTest() {
        mat1 =
                new com.nishant.algorithms.Math.Matrices.Matrix(
                        new double[][]{
                                {1, 2, 3},
                                {4, 5, 6},
                                {7, 8, 9}
                        });
        com.nishant.algorithms.Math.Matrices.Matrix row1 = mat1.getRow(0);
        assertEquals(new com.nishant.algorithms.Math.Matrices.Matrix(new double[][]{{1, 2, 3}}), row1);
        com.nishant.algorithms.Math.Matrices.Matrix row2 = mat1.getRow(1);
        assertEquals(new com.nishant.algorithms.Math.Matrices.Matrix(new double[][]{{4, 5, 6}}), row2);
    }

    @Test
    public void getColTest() {
        mat1 =
                new com.nishant.algorithms.Math.Matrices.Matrix(
                        new double[][]{
                                {1, 2, 3},
                                {4, 5, 6},
                                {7, 8, 9}
                        });
        com.nishant.algorithms.Math.Matrices.Matrix col1 = mat1.getColumn(0);
        assertEquals(new com.nishant.algorithms.Math.Matrices.Matrix(new double[][]{{1}, {4}, {7}}), col1);
        com.nishant.algorithms.Math.Matrices.Matrix col2 = mat1.getColumn(1);
        assertEquals(new com.nishant.algorithms.Math.Matrices.Matrix(new double[][]{{2}, {5}, {8}}), col2);
    }
}
