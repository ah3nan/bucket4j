/**
 * Explicit module descriptor for the Bucket4j Caffeine integration.
 *
 * <p>Declaring the descriptor keeps the artifact an explicit module so it can be
 * resolved on the module path and included in a {@code jlink} image. Both
 * dependencies are exposed by the public API ({@code Caffeine} in
 * {@code Bucket4jCaffeine#builderFor} and {@code Cache} in
 * {@code CaffeineProxyManager#getCache}, plus the Bucket4j proxy types), hence
 * both are {@code transitive}.
 */
module io.github.bucket4j.caffeine {
    requires transitive com.github.benmanes.caffeine;
    requires transitive io.github.bucket4j.core;

    exports io.github.bucket4j.caffeine;
}
