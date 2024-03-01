package chapter06.hlextension;

import javax.swing.*;
import java.awt.*;

public class PixelArtGrid extends JFrame {
    
    private final int rows;
    private final int cols;
    private final int cellSize;
    private final Color[][] gridColors;

    public PixelArtGrid(int rows, int cols, int cellSize) {
        this.rows = rows;
        this.cols = cols;
        this.cellSize = cellSize;
        this.gridColors = new Color[rows][cols];

        // initialize the grid with white color
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                gridColors[i][j] = Color.WHITE;
            }
        }

        // Set up the JFrame
        setTitle("Pixel Art");
        setSize(cols * cellSize, rows * cellSize);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Draw the grid with the current colors
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                g.setColor(gridColors[i][j]);
                g.fillRect(j * cellSize, i * cellSize, cellSize, cellSize);
                g.setColor(Color.BLACK);
                g.drawRect(j * cellSize, i * cellSize, cellSize, cellSize);
            }
        }
    }

    public static void main(String[] args) {
        // Create an instance of the PixelArtGUI
        SwingUtilities.invokeLater(() -> {
            PixelArtGrid pixelArtGUI = new PixelArtGrid(15, 15, 30); // Adjust rows, cols, and cellSize as needed
            pixelArtGUI.setVisible(true);
        });
    }
}