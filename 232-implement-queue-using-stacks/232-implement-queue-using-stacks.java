class MyQueue {
    private final List<Integer> d1 = new ArrayList<>();
    private final List<Integer> d2 = new ArrayList<>();
    private int size = 0;

    public MyQueue() {}
    
    public void push(int x) {
        if (d1.isEmpty() && !d2.isEmpty()) {
            while (!d2.isEmpty()) {
                d1.add(d2.remove(d2.size() - 1));
            }
        }
        d1.add(x);
        size++;
    }
    
    public int pop() {
        if (d1.isEmpty() && !d2.isEmpty()) {
            size--;
            return d2.remove(d2.size() - 1);
        }
        while (!d1.isEmpty()) {
            d2.add(d1.remove(d1.size() - 1));
        }
        size--;
        return d2.remove(d2.size() - 1);
    }
    
    public int peek() {
        if (d1.isEmpty() && !d2.isEmpty()) {
            return d2.get(d2.size() - 1);
        }
        while (!d1.isEmpty()) {
            d2.add(d1.remove(d1.size() - 1));
        }
        return d2.get(d2.size() - 1);
    }
    
    public boolean empty() {
        return size == 0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */