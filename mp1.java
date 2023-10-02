public class mp1 {
    public static void main(String[] args) {
        mp1.createCanvas();
    }
//this is where I made my 2d array
    public static void createCanvas() {
        char[][] canvas = new char[6][10];
        for (int i = 0; i < canvas.length; ++i) {
            for (int j = 0; j < canvas[0].length; ++j) {
                int value = i * j + 3;
                canvas[i][j] = (char) value;
            }
        }
//this is the for loop with if statements I used to create the canvas border
        for (int i = 0; i < canvas.length; ++i) {
            for (int j = 0; j < canvas[0].length; ++j) {
                if ((i == 0 && j == 0) || (i == 0 && j == 9) || (i == 5 && j == 0) || (i == 5 && j == 9)) {
                    canvas[i][j] = '+';
                } else if ((i == 0 && j == 1) || (i == 0 && j == 2) || (i == 0 && j == 3) || (i == 0 && j == 4)
                        || (i == 0 && j == 5) || (i == 0 && j == 6) || (i == 0 && j == 7) || (i == 0 && j == 8)) {
                    canvas[i][j] = '=';
                } else if ((i == 5 && j == 1) || (i == 5 && j == 2) || (i == 5 && j == 3) || (i == 5 && j == 4)
                        || (i == 5 && j == 5) || (i == 5 && j == 6) || (i == 5 && j == 7) || (i == 5 && j == 8)) {
                    canvas[i][j] = '=';
                } else if ((i == 1 && j == 0) || (i == 1 && j == 9) || (i == 2 && j == 0) || (i == 2 && j == 9)
                        || (i == 3 && j == 0) || (i == 3 && j == 9) || (i == 4 && j == 0) || (i == 4 && j == 9)) {
                    canvas[i][j] = '|';
                } else {
                    canvas[i][j] = ' ';
                }
            }
        }

// these are what I used to add my drawing to the canvas 
        canvas[1][2] = '_';
        canvas[1][3] = '_';
        canvas[1][4] = '_';
        canvas[1][5] = '_';
        canvas[1][6] = '_';
        canvas[1][7] = '_';
        canvas[2][2] = '|';
        canvas[2][3] = '<';
        canvas[2][4] = ' ';
        canvas[2][5] = '<';
        canvas[2][6] = ' ';
        canvas[2][7] = '|';
        canvas[3][2] = '|';
        canvas[3][3] = ' ';
        canvas[3][4] = '_';
        canvas[3][5] = '_';
        canvas[3][6] = ' ';
        canvas[3][7] = '|';
        canvas[4][2] = '|';
        canvas[4][3] = '_';
        canvas[4][4] = '_';
        canvas[4][5] = '_';
        canvas[4][6] = '_';
        canvas[4][7] = '|';
    


        

// this is what I used to print my canvas and drawing with spaces in between characters
        for (int i = 0; i < canvas.length; ++i) {
            for (int j = 0; j < canvas[0].length; ++j) {
                System.out.print(canvas[i][j]);
                System.out.print(" ");
            }
            System.out.println();
            System.out.println();
        }
    }
}
