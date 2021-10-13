# ram-common
Common module of all ram project.

## how to use

add to your root pom

```xml
<properties>
    <ram-common.version>new version number</ram-bom.version>
</properties>

<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>top.beanshell</groupId>
            <artifactId>ram-common</artifactId>
            <version>${ram-common.version}</version>
        </dependency>
    </dependencies>
</dependencyManagement>
```

add to your module pom

```xml
<dependency>
    <groupId>top.beanshell</groupId>
    <artifactId>ram-common</artifactId>
</dependency>
```
