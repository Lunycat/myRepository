package JavaTasks.Algoritms.G5_GraphAndSearch.Realization_1;

public class Vertex {
    private String name;
    private boolean isVisited;

    public Vertex(String name) { //Создаёт вершину, присваивает ей имя и добавляет маячёк о том, что он не просмотрен
        this.name = name;
        this.isVisited = false;
    }

    public boolean getIsVisited() {
        return isVisited;
    }

    public boolean setIsVisited(boolean v) {
        return this.isVisited = v;
    }

    public String getName() {
        return name;
    }
}
