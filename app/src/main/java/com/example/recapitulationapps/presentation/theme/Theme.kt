import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.example.recapitulationapps.presentation.theme.AppTypography
import com.example.recapitulationapps.presentation.theme.backgroundDark
import com.example.recapitulationapps.presentation.theme.backgroundDarkHighContrast
import com.example.recapitulationapps.presentation.theme.backgroundDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.backgroundLight
import com.example.recapitulationapps.presentation.theme.backgroundLightHighContrast
import com.example.recapitulationapps.presentation.theme.backgroundLightMediumContrast
import com.example.recapitulationapps.presentation.theme.errorContainerDark
import com.example.recapitulationapps.presentation.theme.errorContainerDarkHighContrast
import com.example.recapitulationapps.presentation.theme.errorContainerDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.errorContainerLight
import com.example.recapitulationapps.presentation.theme.errorContainerLightHighContrast
import com.example.recapitulationapps.presentation.theme.errorContainerLightMediumContrast
import com.example.recapitulationapps.presentation.theme.errorDark
import com.example.recapitulationapps.presentation.theme.errorDarkHighContrast
import com.example.recapitulationapps.presentation.theme.errorDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.errorLight
import com.example.recapitulationapps.presentation.theme.errorLightHighContrast
import com.example.recapitulationapps.presentation.theme.errorLightMediumContrast
import com.example.recapitulationapps.presentation.theme.inverseOnSurfaceDark
import com.example.recapitulationapps.presentation.theme.inverseOnSurfaceDarkHighContrast
import com.example.recapitulationapps.presentation.theme.inverseOnSurfaceDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.inverseOnSurfaceLight
import com.example.recapitulationapps.presentation.theme.inverseOnSurfaceLightHighContrast
import com.example.recapitulationapps.presentation.theme.inverseOnSurfaceLightMediumContrast
import com.example.recapitulationapps.presentation.theme.inversePrimaryDark
import com.example.recapitulationapps.presentation.theme.inversePrimaryDarkHighContrast
import com.example.recapitulationapps.presentation.theme.inversePrimaryDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.inversePrimaryLight
import com.example.recapitulationapps.presentation.theme.inversePrimaryLightHighContrast
import com.example.recapitulationapps.presentation.theme.inversePrimaryLightMediumContrast
import com.example.recapitulationapps.presentation.theme.inverseSurfaceDark
import com.example.recapitulationapps.presentation.theme.inverseSurfaceDarkHighContrast
import com.example.recapitulationapps.presentation.theme.inverseSurfaceDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.inverseSurfaceLight
import com.example.recapitulationapps.presentation.theme.inverseSurfaceLightHighContrast
import com.example.recapitulationapps.presentation.theme.inverseSurfaceLightMediumContrast
import com.example.recapitulationapps.presentation.theme.onBackgroundDark
import com.example.recapitulationapps.presentation.theme.onBackgroundDarkHighContrast
import com.example.recapitulationapps.presentation.theme.onBackgroundDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.onBackgroundLight
import com.example.recapitulationapps.presentation.theme.onBackgroundLightHighContrast
import com.example.recapitulationapps.presentation.theme.onBackgroundLightMediumContrast
import com.example.recapitulationapps.presentation.theme.onErrorContainerDark
import com.example.recapitulationapps.presentation.theme.onErrorContainerDarkHighContrast
import com.example.recapitulationapps.presentation.theme.onErrorContainerDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.onErrorContainerLight
import com.example.recapitulationapps.presentation.theme.onErrorContainerLightHighContrast
import com.example.recapitulationapps.presentation.theme.onErrorContainerLightMediumContrast
import com.example.recapitulationapps.presentation.theme.onErrorDark
import com.example.recapitulationapps.presentation.theme.onErrorDarkHighContrast
import com.example.recapitulationapps.presentation.theme.onErrorDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.onErrorLight
import com.example.recapitulationapps.presentation.theme.onErrorLightHighContrast
import com.example.recapitulationapps.presentation.theme.onErrorLightMediumContrast
import com.example.recapitulationapps.presentation.theme.onPrimaryContainerDark
import com.example.recapitulationapps.presentation.theme.onPrimaryContainerDarkHighContrast
import com.example.recapitulationapps.presentation.theme.onPrimaryContainerDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.onPrimaryContainerLight
import com.example.recapitulationapps.presentation.theme.onPrimaryContainerLightHighContrast
import com.example.recapitulationapps.presentation.theme.onPrimaryContainerLightMediumContrast
import com.example.recapitulationapps.presentation.theme.onPrimaryDark
import com.example.recapitulationapps.presentation.theme.onPrimaryDarkHighContrast
import com.example.recapitulationapps.presentation.theme.onPrimaryDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.onPrimaryLight
import com.example.recapitulationapps.presentation.theme.onPrimaryLightHighContrast
import com.example.recapitulationapps.presentation.theme.onPrimaryLightMediumContrast
import com.example.recapitulationapps.presentation.theme.onSecondaryContainerDark
import com.example.recapitulationapps.presentation.theme.onSecondaryContainerDarkHighContrast
import com.example.recapitulationapps.presentation.theme.onSecondaryContainerDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.onSecondaryContainerLight
import com.example.recapitulationapps.presentation.theme.onSecondaryContainerLightHighContrast
import com.example.recapitulationapps.presentation.theme.onSecondaryContainerLightMediumContrast
import com.example.recapitulationapps.presentation.theme.onSecondaryDark
import com.example.recapitulationapps.presentation.theme.onSecondaryDarkHighContrast
import com.example.recapitulationapps.presentation.theme.onSecondaryDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.onSecondaryLight
import com.example.recapitulationapps.presentation.theme.onSecondaryLightHighContrast
import com.example.recapitulationapps.presentation.theme.onSecondaryLightMediumContrast
import com.example.recapitulationapps.presentation.theme.onSurfaceDark
import com.example.recapitulationapps.presentation.theme.onSurfaceDarkHighContrast
import com.example.recapitulationapps.presentation.theme.onSurfaceDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.onSurfaceLight
import com.example.recapitulationapps.presentation.theme.onSurfaceLightHighContrast
import com.example.recapitulationapps.presentation.theme.onSurfaceLightMediumContrast
import com.example.recapitulationapps.presentation.theme.onSurfaceVariantDark
import com.example.recapitulationapps.presentation.theme.onSurfaceVariantDarkHighContrast
import com.example.recapitulationapps.presentation.theme.onSurfaceVariantDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.onSurfaceVariantLight
import com.example.recapitulationapps.presentation.theme.onSurfaceVariantLightHighContrast
import com.example.recapitulationapps.presentation.theme.onSurfaceVariantLightMediumContrast
import com.example.recapitulationapps.presentation.theme.onTertiaryContainerDark
import com.example.recapitulationapps.presentation.theme.onTertiaryContainerDarkHighContrast
import com.example.recapitulationapps.presentation.theme.onTertiaryContainerDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.onTertiaryContainerLight
import com.example.recapitulationapps.presentation.theme.onTertiaryContainerLightHighContrast
import com.example.recapitulationapps.presentation.theme.onTertiaryContainerLightMediumContrast
import com.example.recapitulationapps.presentation.theme.onTertiaryDark
import com.example.recapitulationapps.presentation.theme.onTertiaryDarkHighContrast
import com.example.recapitulationapps.presentation.theme.onTertiaryDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.onTertiaryLight
import com.example.recapitulationapps.presentation.theme.onTertiaryLightHighContrast
import com.example.recapitulationapps.presentation.theme.onTertiaryLightMediumContrast
import com.example.recapitulationapps.presentation.theme.outlineDark
import com.example.recapitulationapps.presentation.theme.outlineDarkHighContrast
import com.example.recapitulationapps.presentation.theme.outlineDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.outlineLight
import com.example.recapitulationapps.presentation.theme.outlineLightHighContrast
import com.example.recapitulationapps.presentation.theme.outlineLightMediumContrast
import com.example.recapitulationapps.presentation.theme.outlineVariantDark
import com.example.recapitulationapps.presentation.theme.outlineVariantDarkHighContrast
import com.example.recapitulationapps.presentation.theme.outlineVariantDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.outlineVariantLight
import com.example.recapitulationapps.presentation.theme.outlineVariantLightHighContrast
import com.example.recapitulationapps.presentation.theme.outlineVariantLightMediumContrast
import com.example.recapitulationapps.presentation.theme.primaryContainerDark
import com.example.recapitulationapps.presentation.theme.primaryContainerDarkHighContrast
import com.example.recapitulationapps.presentation.theme.primaryContainerDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.primaryContainerLight
import com.example.recapitulationapps.presentation.theme.primaryContainerLightHighContrast
import com.example.recapitulationapps.presentation.theme.primaryContainerLightMediumContrast
import com.example.recapitulationapps.presentation.theme.primaryDark
import com.example.recapitulationapps.presentation.theme.primaryDarkHighContrast
import com.example.recapitulationapps.presentation.theme.primaryDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.primaryLight
import com.example.recapitulationapps.presentation.theme.primaryLightHighContrast
import com.example.recapitulationapps.presentation.theme.primaryLightMediumContrast
import com.example.recapitulationapps.presentation.theme.scrimDark
import com.example.recapitulationapps.presentation.theme.scrimDarkHighContrast
import com.example.recapitulationapps.presentation.theme.scrimDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.scrimLight
import com.example.recapitulationapps.presentation.theme.scrimLightHighContrast
import com.example.recapitulationapps.presentation.theme.scrimLightMediumContrast
import com.example.recapitulationapps.presentation.theme.secondaryContainerDark
import com.example.recapitulationapps.presentation.theme.secondaryContainerDarkHighContrast
import com.example.recapitulationapps.presentation.theme.secondaryContainerDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.secondaryContainerLight
import com.example.recapitulationapps.presentation.theme.secondaryContainerLightHighContrast
import com.example.recapitulationapps.presentation.theme.secondaryContainerLightMediumContrast
import com.example.recapitulationapps.presentation.theme.secondaryDark
import com.example.recapitulationapps.presentation.theme.secondaryDarkHighContrast
import com.example.recapitulationapps.presentation.theme.secondaryDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.secondaryLight
import com.example.recapitulationapps.presentation.theme.secondaryLightHighContrast
import com.example.recapitulationapps.presentation.theme.secondaryLightMediumContrast
import com.example.recapitulationapps.presentation.theme.surfaceBrightDark
import com.example.recapitulationapps.presentation.theme.surfaceBrightDarkHighContrast
import com.example.recapitulationapps.presentation.theme.surfaceBrightDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.surfaceBrightLight
import com.example.recapitulationapps.presentation.theme.surfaceBrightLightHighContrast
import com.example.recapitulationapps.presentation.theme.surfaceBrightLightMediumContrast
import com.example.recapitulationapps.presentation.theme.surfaceContainerDark
import com.example.recapitulationapps.presentation.theme.surfaceContainerDarkHighContrast
import com.example.recapitulationapps.presentation.theme.surfaceContainerDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.surfaceContainerHighDark
import com.example.recapitulationapps.presentation.theme.surfaceContainerHighDarkHighContrast
import com.example.recapitulationapps.presentation.theme.surfaceContainerHighDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.surfaceContainerHighLight
import com.example.recapitulationapps.presentation.theme.surfaceContainerHighLightHighContrast
import com.example.recapitulationapps.presentation.theme.surfaceContainerHighLightMediumContrast
import com.example.recapitulationapps.presentation.theme.surfaceContainerHighestDark
import com.example.recapitulationapps.presentation.theme.surfaceContainerHighestDarkHighContrast
import com.example.recapitulationapps.presentation.theme.surfaceContainerHighestDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.surfaceContainerHighestLight
import com.example.recapitulationapps.presentation.theme.surfaceContainerHighestLightHighContrast
import com.example.recapitulationapps.presentation.theme.surfaceContainerHighestLightMediumContrast
import com.example.recapitulationapps.presentation.theme.surfaceContainerLight
import com.example.recapitulationapps.presentation.theme.surfaceContainerLightHighContrast
import com.example.recapitulationapps.presentation.theme.surfaceContainerLightMediumContrast
import com.example.recapitulationapps.presentation.theme.surfaceContainerLowDark
import com.example.recapitulationapps.presentation.theme.surfaceContainerLowDarkHighContrast
import com.example.recapitulationapps.presentation.theme.surfaceContainerLowDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.surfaceContainerLowLight
import com.example.recapitulationapps.presentation.theme.surfaceContainerLowLightHighContrast
import com.example.recapitulationapps.presentation.theme.surfaceContainerLowLightMediumContrast
import com.example.recapitulationapps.presentation.theme.surfaceContainerLowestDark
import com.example.recapitulationapps.presentation.theme.surfaceContainerLowestDarkHighContrast
import com.example.recapitulationapps.presentation.theme.surfaceContainerLowestDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.surfaceContainerLowestLight
import com.example.recapitulationapps.presentation.theme.surfaceContainerLowestLightHighContrast
import com.example.recapitulationapps.presentation.theme.surfaceContainerLowestLightMediumContrast
import com.example.recapitulationapps.presentation.theme.surfaceDark
import com.example.recapitulationapps.presentation.theme.surfaceDarkHighContrast
import com.example.recapitulationapps.presentation.theme.surfaceDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.surfaceDimDark
import com.example.recapitulationapps.presentation.theme.surfaceDimDarkHighContrast
import com.example.recapitulationapps.presentation.theme.surfaceDimDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.surfaceDimLight
import com.example.recapitulationapps.presentation.theme.surfaceDimLightHighContrast
import com.example.recapitulationapps.presentation.theme.surfaceDimLightMediumContrast
import com.example.recapitulationapps.presentation.theme.surfaceLight
import com.example.recapitulationapps.presentation.theme.surfaceLightHighContrast
import com.example.recapitulationapps.presentation.theme.surfaceLightMediumContrast
import com.example.recapitulationapps.presentation.theme.surfaceVariantDark
import com.example.recapitulationapps.presentation.theme.surfaceVariantDarkHighContrast
import com.example.recapitulationapps.presentation.theme.surfaceVariantDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.surfaceVariantLight
import com.example.recapitulationapps.presentation.theme.surfaceVariantLightHighContrast
import com.example.recapitulationapps.presentation.theme.surfaceVariantLightMediumContrast
import com.example.recapitulationapps.presentation.theme.tertiaryContainerDark
import com.example.recapitulationapps.presentation.theme.tertiaryContainerDarkHighContrast
import com.example.recapitulationapps.presentation.theme.tertiaryContainerDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.tertiaryContainerLight
import com.example.recapitulationapps.presentation.theme.tertiaryContainerLightHighContrast
import com.example.recapitulationapps.presentation.theme.tertiaryContainerLightMediumContrast
import com.example.recapitulationapps.presentation.theme.tertiaryDark
import com.example.recapitulationapps.presentation.theme.tertiaryDarkHighContrast
import com.example.recapitulationapps.presentation.theme.tertiaryDarkMediumContrast
import com.example.recapitulationapps.presentation.theme.tertiaryLight
import com.example.recapitulationapps.presentation.theme.tertiaryLightHighContrast
import com.example.recapitulationapps.presentation.theme.tertiaryLightMediumContrast

private val lightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
    surfaceDim = surfaceDimLight,
    surfaceBright = surfaceBrightLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight,
)

private val darkScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
    surfaceDim = surfaceDimDark,
    surfaceBright = surfaceBrightDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark,
)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = primaryLightMediumContrast,
    onPrimary = onPrimaryLightMediumContrast,
    primaryContainer = primaryContainerLightMediumContrast,
    onPrimaryContainer = onPrimaryContainerLightMediumContrast,
    secondary = secondaryLightMediumContrast,
    onSecondary = onSecondaryLightMediumContrast,
    secondaryContainer = secondaryContainerLightMediumContrast,
    onSecondaryContainer = onSecondaryContainerLightMediumContrast,
    tertiary = tertiaryLightMediumContrast,
    onTertiary = onTertiaryLightMediumContrast,
    tertiaryContainer = tertiaryContainerLightMediumContrast,
    onTertiaryContainer = onTertiaryContainerLightMediumContrast,
    error = errorLightMediumContrast,
    onError = onErrorLightMediumContrast,
    errorContainer = errorContainerLightMediumContrast,
    onErrorContainer = onErrorContainerLightMediumContrast,
    background = backgroundLightMediumContrast,
    onBackground = onBackgroundLightMediumContrast,
    surface = surfaceLightMediumContrast,
    onSurface = onSurfaceLightMediumContrast,
    surfaceVariant = surfaceVariantLightMediumContrast,
    onSurfaceVariant = onSurfaceVariantLightMediumContrast,
    outline = outlineLightMediumContrast,
    outlineVariant = outlineVariantLightMediumContrast,
    scrim = scrimLightMediumContrast,
    inverseSurface = inverseSurfaceLightMediumContrast,
    inverseOnSurface = inverseOnSurfaceLightMediumContrast,
    inversePrimary = inversePrimaryLightMediumContrast,
    surfaceDim = surfaceDimLightMediumContrast,
    surfaceBright = surfaceBrightLightMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestLightMediumContrast,
    surfaceContainerLow = surfaceContainerLowLightMediumContrast,
    surfaceContainer = surfaceContainerLightMediumContrast,
    surfaceContainerHigh = surfaceContainerHighLightMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = primaryLightHighContrast,
    onPrimary = onPrimaryLightHighContrast,
    primaryContainer = primaryContainerLightHighContrast,
    onPrimaryContainer = onPrimaryContainerLightHighContrast,
    secondary = secondaryLightHighContrast,
    onSecondary = onSecondaryLightHighContrast,
    secondaryContainer = secondaryContainerLightHighContrast,
    onSecondaryContainer = onSecondaryContainerLightHighContrast,
    tertiary = tertiaryLightHighContrast,
    onTertiary = onTertiaryLightHighContrast,
    tertiaryContainer = tertiaryContainerLightHighContrast,
    onTertiaryContainer = onTertiaryContainerLightHighContrast,
    error = errorLightHighContrast,
    onError = onErrorLightHighContrast,
    errorContainer = errorContainerLightHighContrast,
    onErrorContainer = onErrorContainerLightHighContrast,
    background = backgroundLightHighContrast,
    onBackground = onBackgroundLightHighContrast,
    surface = surfaceLightHighContrast,
    onSurface = onSurfaceLightHighContrast,
    surfaceVariant = surfaceVariantLightHighContrast,
    onSurfaceVariant = onSurfaceVariantLightHighContrast,
    outline = outlineLightHighContrast,
    outlineVariant = outlineVariantLightHighContrast,
    scrim = scrimLightHighContrast,
    inverseSurface = inverseSurfaceLightHighContrast,
    inverseOnSurface = inverseOnSurfaceLightHighContrast,
    inversePrimary = inversePrimaryLightHighContrast,
    surfaceDim = surfaceDimLightHighContrast,
    surfaceBright = surfaceBrightLightHighContrast,
    surfaceContainerLowest = surfaceContainerLowestLightHighContrast,
    surfaceContainerLow = surfaceContainerLowLightHighContrast,
    surfaceContainer = surfaceContainerLightHighContrast,
    surfaceContainerHigh = surfaceContainerHighLightHighContrast,
    surfaceContainerHighest = surfaceContainerHighestLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkMediumContrast,
    onPrimary = onPrimaryDarkMediumContrast,
    primaryContainer = primaryContainerDarkMediumContrast,
    onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
    secondary = secondaryDarkMediumContrast,
    onSecondary = onSecondaryDarkMediumContrast,
    secondaryContainer = secondaryContainerDarkMediumContrast,
    onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
    tertiary = tertiaryDarkMediumContrast,
    onTertiary = onTertiaryDarkMediumContrast,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
    error = errorDarkMediumContrast,
    onError = onErrorDarkMediumContrast,
    errorContainer = errorContainerDarkMediumContrast,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    background = backgroundDarkMediumContrast,
    onBackground = onBackgroundDarkMediumContrast,
    surface = surfaceDarkMediumContrast,
    onSurface = onSurfaceDarkMediumContrast,
    surfaceVariant = surfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
    outline = outlineDarkMediumContrast,
    outlineVariant = outlineVariantDarkMediumContrast,
    scrim = scrimDarkMediumContrast,
    inverseSurface = inverseSurfaceDarkMediumContrast,
    inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
    inversePrimary = inversePrimaryDarkMediumContrast,
    surfaceDim = surfaceDimDarkMediumContrast,
    surfaceBright = surfaceBrightDarkMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkMediumContrast,
    surfaceContainerLow = surfaceContainerLowDarkMediumContrast,
    surfaceContainer = surfaceContainerDarkMediumContrast,
    surfaceContainerHigh = surfaceContainerHighDarkMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    background = backgroundDarkHighContrast,
    onBackground = onBackgroundDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast,
    surfaceDim = surfaceDimDarkHighContrast,
    surfaceBright = surfaceBrightDarkHighContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkHighContrast,
    surfaceContainerLow = surfaceContainerLowDarkHighContrast,
    surfaceContainer = surfaceContainerDarkHighContrast,
    surfaceContainerHigh = surfaceContainerHighDarkHighContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkHighContrast,
)

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

val unspecified_scheme = ColorFamily(
    Color.Unspecified, Color.Unspecified, Color.Unspecified, Color.Unspecified
)

@Composable
fun WiaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable() () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> darkScheme
        else -> lightScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = AppTypography,
        content = content
    )
}
