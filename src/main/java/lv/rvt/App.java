package lv.rvt;


class App
{

  public static void main ( String[] args )
  {
     Box box = new  Box( 2.5, 5.0, 6.0 ) ;

      System.out.println("Box 1 - Volume: " + box.volume());
      System.out.println("Box 1 - Surface Area: " + box.area());
      System.out.println("Box 1 - Width: " + box.width());
      System.out.println("Box 1 - Height: " + box.height());
      System.out.println("Box 1 - Length: " + box.length());

      Box box2 = new Box(box);

      System.out.println("Box 2 (copied from Box 1) - Volume: " + box2.volume());
      System.out.println("Box 2 (copied from Box 1) - Surface Area: " + box2.area());
      System.out.println("Box 2 (copied from Box 1) - Width: " + box2.width());
      System.out.println("Box 2 (copied from Box 1) - Height: " + box2.height());
      System.out.println("Box 2 (copied from Box 1) - Length: " + box2.length());

  }
}


