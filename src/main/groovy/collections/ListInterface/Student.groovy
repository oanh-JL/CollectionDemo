package collections.ListInterface

class Student {
    String name
    float diem
    String province

    Student() {
    }

    Student(String name, float diem, String province) {
        this.name = name
        this.diem = diem
        this.province = province
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    float getDiem() {
        return diem
    }

    void setDiem(float diem) {
        this.diem = diem
    }

    String getProvince() {
        return province
    }

    void setProvince(String province) {
        this.province = province
    }

    @Override
    String toString() {
        return name + '\t' + diem + '\t' + province
    }
}
