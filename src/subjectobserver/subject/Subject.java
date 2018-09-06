package subjectobserver.subject;

import subjectobserver.observer.Observer;

public interface Subject {
    void registerobserver(Observer o);
    void removeobserver(Observer o);
    void notifyobserver();
}
