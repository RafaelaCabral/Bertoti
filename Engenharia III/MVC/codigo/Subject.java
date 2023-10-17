public interface Subject {
    void registerObserver(Observer o);
    void notifyObservers(List<String> encontrados);
}