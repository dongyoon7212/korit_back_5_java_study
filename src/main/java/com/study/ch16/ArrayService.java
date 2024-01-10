package com.study.ch16;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ArrayService {
    private String[] strArray;

    public void add(String str) {
        String[] newArray = new String[strArray.length + 1]; // 새로운 배열에 한칸을 추가한다.
        for (int i = 0; i < strArray.length; i++) { // strArray에 있던 값들을 newArray에 옮긴다.
            newArray[i] = strArray[i];
        }
        strArray = newArray; // 새로 만들어진 배열을 기존에 있던 배열에 넣는다.
        strArray[strArray.length - 1] = str; // 배열 끝에 추가
    }

    public String get(int index) {
        return strArray[index];
    }

    public void remove(int index) {
        String[] removeArray = new String[strArray.length - 1];
//        for (int i = 0; i < index; i++) { // index보다 앞쪽 배열 값을 옮기는거
//            removeArray[i] = strArray[i];
//        }
//        for (int i = index; i < strArray.length - 1; i++) { // index보다 뒷쪽 배열 값 옮기는거
//            removeArray[i] = strArray[i + 1];
//        }
//        strArray = removeArray;
        for (int i = 0; i < removeArray.length; i++) {
            removeArray[i] = strArray[i < index ? i : i + 1];
        }
        strArray = removeArray;
    }

    public int indexOf(String str) {
        if (str == null) {
            return -1;
        }
        for (int i = 0; i < strArray.length; i++) { // 선형검색
            if (strArray[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String result = "Array[ ";

        for (int i = 0; i < strArray.length; i++) {
            result += strArray[i];
            if (i < strArray.length - 1) {
                result += ", ";
            }
        }
        result += " ]";

        return result;
    }
}
