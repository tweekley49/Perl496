package csu.csci325;

/**
 * Created by pwest on 3/15/16.
 */
public class Maze {

    private char[][] mMaze = {
            { 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w'},
            { 'w', 'o', 'w', 'w', 'w', 'w', 'w', 'o', 'w', 'w'},
            { 'o', 'o', 'o', 'o', 'o', 'w', 'w', 'o', 'w', 'w'},
            { 'o', 'w', 'o', 'w', 'o', 'o', 'o', 'o', 'w', 'w'},
            { 'w', 'w', 'o', 'w', 'o', 'w', 'w', 'o', 'w', 'w'},
            { 'w', 'w', 'o', 'w', 'o', 'w', 'w', 'o', 'o', 'o'},
            { 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'o'},
            { 'w', 'w', 'w', 'w', 'w', 'w', 'o', 'w', 'w', 'o'}
    };
    public Maze() {

    }
    public boolean canTraverse(int cxPos, int cyPos, int exPos, int eyPos) {
        boolean found = false;
        if (cxPos < 0 || cxPos >= mMaze.length || cyPos < 0 || cyPos >= mMaze[0].length) {
            return false;
        }
        if (mMaze[cxPos][cyPos] == 'w' || mMaze[cxPos][cyPos] == 'v') {
            return false;
        }
        if (cxPos == exPos && cyPos == eyPos) {
            System.out.println("Path found, my path in reverse order is:");
            System.out.println ("(" + cxPos + ", " + cyPos + ")");
            return true;
        }
        System.out.println("Evaluating: " + "(" + cxPos + ", " + cyPos + ")");
        mMaze[cxPos][cyPos] = 'v';
        found =  canTraverse(cxPos-1, cyPos, exPos, eyPos)
                || canTraverse(cxPos+1, cyPos, exPos, eyPos)
                || canTraverse(cxPos, cyPos-1, exPos, eyPos)
                || canTraverse(cxPos, cyPos+1, exPos, eyPos);
        if (found) {
            System.out.println ("(" + cxPos + ", " + cyPos + ")");
        }
        return found;
    }
    private class Node {
        int mX, mY;
        public Node(int x, int y) {
            mX = x;
            mY = y;
        }
    }
    public char[][] canTraverseSLL(char[][] maze, int cxPos, int cyPos, int exPos, int eyPos) {
        mMaze = maze;
        canTraverseSLL(cxPos, cyPos, exPos, eyPos);
        Stack<Node> stack = new LinkedListStack<>();
        stack.push(new Node(cxPos, cyPos));
        while (!stack.isEmpty()) {
            if (canTraverseSLL(cxPos, cyPos, exPos, eyPos)) {
                if (maze[cxPos][cyPos] == 'v')
                {maze[cxPos][cyPos] = 'p';}
            }
        }
        return mMaze;
    }
    public boolean canTraverseSLL(int cxPos, int cyPos, int exPos, int eyPos) {
        Stack<Node> stack = new LinkedListStack<>();
        stack.push(new Node(cxPos, cyPos));
        while (!stack.isEmpty()) {
            Node pos = stack.pop();
            if (pos.mX < 0 || pos.mX >= mMaze.length || pos.mY < 0 || pos.mY >= mMaze[0].length) {
                continue;
            }
            if (mMaze[pos.mX][pos.mY] == 'w' || mMaze[pos.mX][pos.mY] == 'v') {
                continue;
            }
            if (pos.mX == exPos && pos.mY == eyPos) {
                //System.out.println("Path found, my path in reverse order is:");
                System.out.println("(" + pos.mX + ", " + pos.mY + ")");
                return true;
            }
            mMaze[pos.mX][pos.mY] = 'v';
            stack.push(new Node(pos.mX - 1, pos.mY));
            stack.push(new Node(pos.mX + 1, pos.mY));
            stack.push(new Node(pos.mX, pos.mY - 1));
            stack.push(new Node(pos.mX, pos.mY + 1));
        }
        return false;
    }
    public void printMaze() {
        for(int i = 0; i < mMaze.length; i++) {
            for (int j = 0; j < mMaze[i].length; j++) {
                System.out.print(mMaze[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Maze maze = new Maze();
        char[][] maze1 = new char[7][9];
        //System.out.println(maze.canTraverse(7, 9, 7, 9));
        //System.out.println(maze.canTraverse(2, 0, 7, 9));
        System.out.println(maze.canTraverseSLL(2, 0, 7, 6));
        maze.printMaze();
    }
}
