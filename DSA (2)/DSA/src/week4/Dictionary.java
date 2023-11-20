package week4;

public class Dictionary <K,V>{
    private K key;
    private V vlaue;

    @Override
    public String toString() {
        return "Dictionary{" + "key=" + key + ", vlaue=" + vlaue + '}';
    }

    public Dictionary(K key, V vlaue) {
        this.key = key;
        this.vlaue = vlaue;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getVlaue() {
        return vlaue;
    }

    public void setVlaue(V vlaue) {
        this.vlaue = vlaue;
    }
    
}
