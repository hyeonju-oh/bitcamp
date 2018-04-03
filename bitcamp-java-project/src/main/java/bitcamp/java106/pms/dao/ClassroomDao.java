package bitcamp.java106.pms.dao;

import java.util.LinkedList;

import bitcamp.java106.pms.domain.Classroom;

public class ClassroomDao {
    private LinkedList<Classroom> collection = new LinkedList<>();
    
    public void insert(Classroom classroom) {
        this.collection.add(classroom);
    }
    
    public Classroom[] list() {
        Classroom[] arr = new Classroom[this.collection.size()];
        return this.collection.toArray(arr);
    }
    
    public Classroom get(int no) {
        int index = this.getClassroomIndex(no);
        if (index < 0) 
            return null;
        return collection.get(index);
    }
    
    public void update(Classroom classroom) {
        int index = this.getClassroomIndex(classroom.getNo());
        if (index < 0) 
            return;
        collection.set(index, classroom);
    }
    
    public void delete(int no) {
        int index = this.getClassroomIndex(no);
        if (index < 0) 
            return;
        collection.remove(index);
    }
    
    private int getClassroomIndex(int no) {
        for (int i = 0; i < collection.size(); i++) {
            Classroom originClassroom = collection.get(i);
            if (originClassroom.getNo() == no) {
                return i;
            }
        }
        return -1;
    }
}

//ver 19 - 우리 만든 ArrayList 대신 java.util.LinkedList를 사용하여 목록을 다룬다. 
//ver 18 - ArrayList를 이용하여 인스턴스(의 주소) 목록을 다룬다. 
// ver 16 - 인스턴스 변수를 직접 사용하는 대신 겟터, 셋터 사용.
// ver 14 - ClassroomController로부터 데이터 관리 기능을 분리하여 ClassroomDao 생성.





