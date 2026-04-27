package _17_11_25;

import java.util.Arrays;

public class Example {
	enum Color{
		RED("stop"),YELLOW("ready"),GREEN("start");
		private String msg;
		private Color(String msg) {
			this.msg=msg;
		}
		public String getMsg() {
			return msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //Color[] c=Color.values();
      //System.out.println(Arrays.toString(c));
      for(Color obj:Color.values()) {
    	  System.out.println(obj+":"+obj.getMsg()+":"+obj.ordinal());
      }
	}

}
