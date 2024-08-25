package Builder.BuildingQueries;

public class Client {
    public static void main(String[] args) {
        QueryBuilder q = QueryBuilder.getBuilder().setSelect("select").setFrom("* from ").setJoin(" A join on B").setGroupBy("A").setOrderBy("desc").build();
        System.out.println(q.getSelect() +" "+ q.getFrom()+" "+ q.getJoin());
    }
}
