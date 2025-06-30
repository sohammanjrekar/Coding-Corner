# Backtracking is a technique for solving problems incrementally, building candidates to the solutions, and abandoning candidates ("backtrack") as soon as it is determined that they cannot be extended to a valid solution.
# ex: N-Queens problem, Sudoku solver, etc.
def is_valid(board, row, col):
    # Check if the column has a queen
    for i in range(row):
        if board[i] == col or \
           board[i] - i == col - row or \
           board[i] + i == col + row:
            return False
    return True
def solve_n_queens(n, row=0, board=None):
    if board is None:
        board = [-1] * n  # Initialize the board with -1 (no queens placed)
    if row == n:  # All queens are placed
        return [board[:]]  # Return a copy of the board
    solutions = []
    for col in range(n):
        if is_valid(board, row, col):
            board[row] = col  # Place the queen
            solutions += solve_n_queens(n, row + 1, board)  # Recur to place the next queen
            board[row] = -1  # Backtrack
    return solutions
# Example usage
if __name__ == "__main__":
    n = 4  # Size of the chessboard
    solutions = solve_n_queens(n)
    print(f"Number of solutions for {n}-Queens problem: {len(solutions)}")
    for solution in solutions:
        print(solution)  # Print each solution as a list of column indices for each row
        for i in range(n):
            row = ["." for _ in range(n)]
            row[solution[i]] = "Q"
            print(" ".join(row))
        print()
