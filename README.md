# gradle-8.5-continuous-build-issue

```
cd workspace

./gradlew classes -t
```

Then update the P1.java, will see the P1.class in build folder not updated.

See to be a bug when loading projects from "../" path, so the root gradle project is not in the same folder with all the sub-projects, then continuous build feature is not working anymore.

