package JavaCollection.List;

import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(4);
        st.push(5);
        st.peek();
        st.pop();
        st.size();
        st.clear();
    }
}
