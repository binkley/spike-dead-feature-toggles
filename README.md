# Spike dead feature toggles

The best defense against dead code (unused code) is _code coverage_. The next
best defense is refactoring. Unused toggles leads to dead code: use the two
defenses to keep your code base clean.

The first step in making code dead (disabling code) is removing tests for that
code. That drops the coverage.

Your build should require a minimum level of code coverage, and fail the build
if not met.

## Building

```
$ ./mvnw clean verify
```

### Test with toggle on

```
$ ./mvnw clean verify -Dtoggles=extraCool 
```

### Test with toggle off

This fails tests.

```
$ ./mvnw clean verify -Dtoggles=
```

## Coverage

### Example 1 &mdash; full coverage

If you have 100% code coverage, any new unused code fails the build. Existing
dead would have already been removed to reach 100%.

### Example 2 &mdash; refactoring away covered code

If your coverage is not 100%, ensure your minimum level of coverage in the
build is the maximum value for the build to pass.

> One technique for this: set your build to expect a minimum of 100% coverage;
> when it fails, update the build to expect the current actual coverage as the
> minimum.

Refactoring away existing covered code (even merely reducing its line count)
lowers code coverage; in turn, this fails the build. To compensate, remove
dead code, or add coverage to untested code.

> Given a code base of 10 lines, 9 of which are covered, and 1 which is
> uncovered. Your coverage is 9/10 or 90%. Remove 1 covered line: the coverage
> becomes 8/9 or 89%.

### Skipping coverage with intention

There may be cases where you wish to skip coverage on a function or class. A
typical example is `main()`  In the JVM world, JaCoCo is the coverage tool of
choice, and it understands the `@lombok.Generated` annotation to mean: ignore
this code for coverage. Use this power **sparingly**.

## Toggles

Feature toggles intentionally create dead code. In typical development,
features accumulate over time, and few are removed. However, when needing
removal it is difficult to find all impacted code without coverage. Good luck.

Perhaps more important is to _remove toggles_ for code that becomes 
permanent.  In this spike, you can disable a toggle from the command line 
during build, and see tests fail.  Remove the toggle from the production 
code, and see the test pass again.
