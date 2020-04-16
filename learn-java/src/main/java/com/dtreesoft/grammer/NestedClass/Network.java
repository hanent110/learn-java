package com.dtreesoft.grammer.NestedClass;

import java.util.ArrayList;

public class Network {
    private ArrayList<Member> members = new ArrayList<Member>();

    public Network() {
    }

    public void display() {
        System.out.println("");
    }

    public Member enroll(String name) {
        // 1과 2는 같은 의미 이다.
//        Member newMember = this.new Member(name);     // --- 1
        Member newMember = new Member(name);            // --- 2
        members.add(newMember);

        return newMember;
    }

    public PublicMember enrollPublic(String name) {
        // 1과 2는 같은 의미 이다.
//        Member newMember = this.new Member(name);     // --- 1
        PublicMember newMember = new PublicMember(name);            // --- 2
        members.add(newMember);

        return newMember;
    }


    public DefaultMember enrollDefalutMember(String name) {
        // 1과 2는 같은 의미 이다.
//        Member newMember = this.new Member(name);             // --- 1
        DefaultMember newMember = new DefaultMember(name);      // --- 2
        members.add(newMember);

        return newMember;
    }

    public PrivateMember enrollPrivateMember(String name) {
        // 1과 2는 같은 의미 이다.
//        Member newMember = this.new Member(name);             // --- 1
        PrivateMember newMember = new PrivateMember(name);      // --- 2
        members.add(newMember);

        return newMember;
    }

    public void unenroll(Member m) {
//        ...
    }

    //------------------------------------------------------------------------------------------------------------------
    // Inner Class
    //  외부에서 클래스를 생성할 수 없다.
    public class Member {
        private String name;
        private ArrayList<Member> friends;

        public Member() {
            this("noname");
        }

        public Member(String name) {
            this.name = name;
            friends = new ArrayList<Member>();
        }

        public void leave() {
            // 1과 2는 같은 의미 이다.
//            Network.this.members.remove(this);    // --- 1
            members.remove(this);                // --- 2
        }

        public String showInfo() {
            String info = "my name is " + name;
            System.out.println(info);
            return info;
        }
    }

    public class PublicMember extends Member {
        public PublicMember(String name) {
            super(name);
        }
    }

    class DefaultMember extends Member {
        public DefaultMember(String name) {
            super(name);
        }
    }

    private class PrivateMember extends Member {
        public PrivateMember(String name) {
            super(name);
        }
    }
}
