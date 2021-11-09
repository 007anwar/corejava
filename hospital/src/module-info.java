module hospital {
    requires  transitive billing;
    requires transitive management;
    exports hospital;
}