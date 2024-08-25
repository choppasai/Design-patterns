package Builder.BuildingQueries;


public class QueryBuilder {
    private String select;
    private String from;
    private String where;
    private String join;
    private String orderBy;
    private String groupBy;

    public String getSelect() {
        return select;
    }

    public String getFrom() {
        return from;
    }

    public String getWhere() {
        return where;
    }

    public String getJoin() {
        return join;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public static Builder getBuilder(){
        return new Builder();
    }
    private QueryBuilder(Builder builder){
        this.select = builder.getSelect();
        this.from = builder.getFrom();
        this.groupBy = builder.getGroupBy();
        this.join = builder.getJoin();
        this.orderBy = builder.getOrderBy();
        this.where = builder.getWhere();
    }
    public static class Builder{
        private String select;
        private String from;
        private String where;
        private String join;
        private String orderBy;
        private String groupBy;

        public String getSelect() {
            return select;
        }

        public Builder setSelect(String select) {
            this.select = select;
            return this;
        }

        public String getFrom() {
            return from;
        }

        public Builder setFrom(String from) {
            this.from = from;
            return this;
        }

        public String getWhere() {
            return where;
        }

        public Builder setWhere(String where) {
            this.where = where;
            return this;
        }

        public String getJoin() {
            return join;
        }

        public Builder setJoin(String join) {
            this.join = join;
            return this;
        }

        public String getOrderBy() {
            return orderBy;
        }

        public Builder setOrderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        public String getGroupBy() {
            return groupBy;
        }

        public Builder setGroupBy(String groupBy) {
            this.groupBy = groupBy;
            return this;
        }
        public QueryBuilder build(){
            return new QueryBuilder(this);
        }
    }
}

