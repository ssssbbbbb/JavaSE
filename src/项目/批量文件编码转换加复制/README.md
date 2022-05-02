# 项目：批量文件编码转换加复制
## 概述
因为之前练习Java的时候写的代码都是用GDK编码写的。  
因此，此次的目的是将以前写的Java文件，全部更改为UTF-8编码，再复制到现有的文件中。

## 计划 
- 目标位置： C:\Users\hhhhh\Documents\MyCode\Java_Eclipse
- 新位置：C:\Users\hhhhh\Documents\MyCode\IDEA_Java\src

<br/>

1. 因为目标文件目录里有需要的文件和不需要的文件，因此需要先将它们分离出来！
```text
创建一个File对象，将该目录里需要的项目文件夹遍历保存。
得到需要的文件夹后再遍历里面的Java文件，如果项目文件夹下面还有文件夹，则就再遍历。
        
        
                            目标                             if(isDirectory())
                                                                   ↓
      A             B               C           D           if(isDirectory())
                                                                    ↓
    a1,a2,a3    b1,b2,B3        C1,c2,c3     d1,d3,d...     if(isDirectory())
                        ......                                    ......
```
