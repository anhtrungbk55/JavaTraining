package com.bkav.training.week2new.session6;

public class MyNodeStack {
	private Node[] values;

	/* Các phương thức khởi dựng */
	public MyNodeStack() {
	}

	public MyNodeStack(Node[] values) {
		this.values = values;
	}

	/* Phương thức lấy ra một node từ stack */
	public Node pop() {
		Node result = null;
		if ((values != null) && (values.length > 0)) {
			result = values[values.length - 1];
			
			// Loại bỏ node cuối cùng
			Node[] tmpNode = new Node[values.length - 1];
			for (int i = 0; i < values.length - 1; i++)
				tmpNode[i] = values[i];
			this.values = tmpNode;
		}
		return result;
	}

	/* Phương thức thêm một node vào stack */
	public void push(Node node) {
		if (values == null) { // Ngăn xếp đang rỗng
			values = new Node[1];
			values[0] = node;
		} else { // Ngăn xếp đã có dữ liệu
			Node[] tmpNode = new Node[values.length + 1];
			for (int i = 0; i < values.length; i++)
				tmpNode[i] = values[i];
			tmpNode[values.length] = node;
			this.values = tmpNode;
		}
	}
}
