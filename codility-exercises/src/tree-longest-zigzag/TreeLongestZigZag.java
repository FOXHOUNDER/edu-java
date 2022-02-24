public class TreeLongestZigZag {
  public static void main(String[] args) throws Exception {
    Tree T = null;

    int len = 0;
    len = path(T, 'X');

    System.out.println(len < 0 ? 0 : len);

    return;
  }

  public static int path(Tree T, char dir) {
    if (T == null)
      return -1;

    int ld = (dir == 'R' ? 1 : 0) + path(T.l, 'L');
    int rd = (dir == 'L' ? 1 : 0) + path(T.r, 'R');

    int lzz = Math.max(ld, rd);

    return lzz;
  }
}