package test.package5;

public class Cuboid {
			int height;
			int width;
			int depth;
			
			Cuboid (int height , int width , int depth) {
				this.height= height;
				this.width= width;
				this.depth= depth;
			}
			Cuboid (int height , int width){
				this.height= height;
				this.width= width;
				this.depth= 10;
			}
			Cuboid (){
				this.height= 70;
				this.width= 20;
				this.depth= 30;
			}
			Cuboid (int dimension){
				height = dimension;
				width = dimension;
				depth = dimension;
			}
			int volume() {
			return height* width* depth;
			}
			public static void main(String [] args) {
				int volume;
				
				Cuboid stdcuboid = new Cuboid (90);
				volume= stdcuboid.volume();
				System.out.println(volume);
			}
}
