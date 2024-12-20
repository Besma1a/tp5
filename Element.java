package tp5;

public class Element {

		private int id;

		public Element(int id) {
		    this.id = id;
		}

		public void setId(int id) {
		  this.id = id;
		}

		public int getId() {
		    return id;
		}

		@Override
		public String toString() {
		  return "Element [id=" + id + "]";
		}

		}

