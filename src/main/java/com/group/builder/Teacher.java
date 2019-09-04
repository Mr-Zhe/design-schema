package com.group.builder;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/4 13:48
 * @version: 1.1.0
 */
public class Teacher{
    private Integer id;
    private String name;
    private String sex;

    public Teacher(Integer id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
        System.out.println(String.format("老师姓名:%s 性别:%s", this.getName(), this.getSex()));
    }

    public static Builder builder(){
        return new Builder();
    }

    public void out(){
        System.out.println(String.format("老师姓名:%s 性别:%s", this.getName(), this.getSex()));
    }

    public static class Builder{
        private Integer id;
        private String name;
        private String sex;

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder sex(String sex) {
            this.sex = sex;
            return this;

        }

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getSex() {
            return sex;
        }

        public Teacher build(){
            Teacher teacher = new Teacher(this.getId(), this.getName(), this.getSex());
            return teacher;
        }
    }
}
