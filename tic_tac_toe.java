public String checkGameWinner(char [][]grid){
        String result = "None";
        //vertical check
        for (int i=0; i<3; i++) {
            if ((grid[i][0] == 'x')
                 && (grid[i][1] == 'x')
                 && (grid[i][2] == 'x')) {
                return "X wins";
            }
            if ((grid[i][0] == 'o')
                    && (grid[i][1] == 'o')
                    && (grid[i][2] == 'o')) {
                return "O wins";
            }
        }
        //horizontal check
        for (int j=0; j<3; j++) {
            if ((grid[0][j] == 'x')
                && (grid[1][j] == 'x')
                && (grid[2][j] == 'x')){
                return "X wins";
            }
            if ((grid[0][j] == 'o')
                    && (grid[1][j] == 'o')
                    && (grid[2][j] == 'o')){
                return "O wins";
            }
        }
        //diagonal left
        if ((grid[0][0] == 'x')
                && (grid[1][1] == 'x')
                && (grid[2][2] == 'x')) {
            return "X wins";
        }
        if ((grid[0][0] == 'o')
                && (grid[1][1] == 'o')
                && (grid[2][2] == 'o')) {
            return "O wins";
        }

        //diagonal right
        if ((grid[0][2] == 'x')
                && (grid[1][1] == 'x')
                && (grid[2][0] == 'x')) {
            return "X wins";
        }
        if ((grid[0][2] == 'o')
                && (grid[1][1] == 'o')
                && (grid[2][0] == 'o')) {
            return "X wins";
        }

        if (freeSpots > 0) {
            return result;
        } else {
            return "Tie";
        }
    }