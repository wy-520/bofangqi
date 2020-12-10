package pers.jyb.evolplayer;

import java.io.Serializable;
import java.util.Objects;
//用javabean来统一封装参数
/**Serializable是java.io包中定义的、用于实现Java类的序列化操作而提供的一个语义级别的接口。
 * Serializable序列化接口没有任何方法或者字段，只是用于标识可序列化的语义。
 * 实现了Serializable接口的类可以被ObjectOutputStream转换为字节流，同时也可以通过ObjectInputStream再将其解析为对象。
 * 例如，我们可以将序列化对象写入文件后，再次从文件中读取它并反序列化成对象，
 * 也就是说，可以使用表示对象及其数据的类型信息和字节在内存中重新创建对象。 */
public class Music implements Serializable {
    private Long id;
    private String name;
    private String artist;
    private int duration;
    private String data;

    Music(){

    }

    Long getId() {
        return id;
    }

    void setId(Long id) {
        this.id = id;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getArtist() {
        return artist;
    }

    void setArtist(String artist) {
        this.artist = artist;
    }

    int getDuration() {
        return duration;
    }

    void setDuration(int duration) {
        this.duration = duration;
    }

    String getData() {
        return data;
    }

    void setData(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //测试一个对象是否为一个类的实例
        if (!(o instanceof Music)) return false;
        Music music = (Music) o;
        return duration == music.duration &&
                Objects.equals(id, music.id) &&
                Objects.equals(name, music.name) &&
                Objects.equals(artist, music.artist) &&
                Objects.equals(data, music.data);
    }
}
