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
    }
}
