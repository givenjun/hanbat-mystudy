package org.example.myapp;

import com.google.common.base.Joiner;
import org.example.util.Utils;

/** 이 클래스는 메인 애플리케이션이다. */
public class App {
  /**
   * 애플리케이션 entry point 이다.
   *
   * @param args 프로그램 아규먼트
   * @see <a href="https://docs.oracle.com/en/java/javase/21/">JDK Documentation</a>
   */
  public static void main(String[] args) {
    Utils.printMessage("hello!");
    String message = Joiner.on(", ").join("hello", "world");
    System.out.println(message);
  }
}
