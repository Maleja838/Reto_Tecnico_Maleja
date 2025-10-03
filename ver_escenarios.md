# 👀 Cómo Ver Gráficamente Cada Escenario de Prueba

## 🎯 **Método Principal: Reporte HTML de Serenity**

### **1. Generar Reporte**
```bash
.\gradlew.bat aggregate
```

### **2. Abrir Reporte en Navegador**
```bash
start "target\site\serenity\index.html"
```

### **3. Ubicación del Reporte**
```
📁 target/site/serenity/
├── 📄 index.html          ← Archivo principal del reporte
├── 📊 results.csv         ← Datos tabulares
├── 📝 summary.txt         ← Resumen de resultados
└── 📂 [carpetas de recursos]
```

## 📊 **Contenido del Reporte**

El reporte HTML de Serenity incluye:

### **Dashboard Principal**
- ✅ **Resumen de escenarios**: Total, pasados, fallidos
- 📈 **Gráficos de tendencias**: Tiempo de ejecución
- 🎯 **Estado por feature**: Progreso visual
- 📱 **Responsive design**: Se ve bien en móvil

### **Vista Detallada por Escenario**
- 📋 **Pasos del escenario**: Given, When, Then
- 🖼️ **Screenshots automáticos**: Capturas en cada paso
- ⏱️ **Tiempos de ejecución**: Duración de cada paso
- 🔍 **Logs detallados**: Información de debugging

### **Navegación Visual**
- 🌳 **Estructura jerárquica**: Features → Scenarios → Steps
- 🔍 **Filtros y búsqueda**: Encontrar escenarios específicos
- 📊 **Métricas visuales**: Gráficos y estadísticas

## 🚨 **Estado Actual**

**Problema**: Las pruebas no se ejecutan correctamente debido a incompatibilidad con Java 25.

**Solución**: 
1. **Cambiar a Java 8 o 11**
2. **O usar un test simple sin Serenity**

## 🛠️ **Alternativas para Ver Escenarios**

### **Opción 1: Ver Features Directamente**
```bash
# Ver contenido de cada escenario
type "test\resources\features\datepicker_scenario_1.feature"
type "test\resources\features\datepicker_scenario_2.feature"
type "test\resources\features\datepicker_scenario_3.feature"
```

### **Opción 2: Estructura del Proyecto**
```bash
# Ver estructura completa
tree /f

# Ver solo archivos de pruebas
dir /s *.java
dir /s *.feature
```

### **Opción 3: Configuración**
```bash
# Ver configuración de Serenity
type serenity.properties

# Ver configuración de Gradle
type build.gradle
```

## 🎨 **Características Visuales del Reporte**

### **Cuando Funcione Correctamente, Verás:**

1. **📊 Dashboard con Métricas**
   - Gráfico de barras con escenarios pasados/fallidos
   - Tiempo total de ejecución
   - Porcentaje de éxito

2. **🌳 Navegación por Features**
   - Lista expandible de features
   - Estado visual (✅ verde, ❌ rojo, ⏳ amarillo)
   - Contador de escenarios

3. **📋 Detalle de Escenarios**
   - Pasos del escenario con checkmarks
   - Screenshots en cada paso
   - Logs de Selenium WebDriver
   - Tiempo de cada paso

4. **📈 Gráficos de Tendencias**
   - Tiempo de ejecución por escenario
   - Tasa de éxito por fecha
   - Comparaciones históricas

## 🚀 **Para Ejecutar Correctamente**

### **Requisitos:**
- ✅ Java 8 o 11 (no Java 25)
- ✅ ChromeDriver compatible
- ✅ Navegador Chrome instalado

### **Comandos:**
```bash
# 1. Configurar Java correcto
set JAVA_HOME=C:\Program Files\Java\jdk-11

# 2. Ejecutar pruebas
.\gradlew.bat test

# 3. Generar reporte
.\gradlew.bat aggregate

# 4. Abrir reporte
start "target\site\serenity\index.html"
```

## 📱 **Visualización Móvil**

El reporte de Serenity es responsive y se ve perfecto en:
- 💻 **Desktop**: Vista completa con todos los detalles
- 📱 **Mobile**: Vista optimizada para pantallas pequeñas
- 📟 **Tablet**: Vista intermedia adaptativa

## 🎯 **Resumen**

**Para ver gráficamente los escenarios:**
1. ✅ **Reporte HTML** (método principal)
2. ✅ **Features Gherkin** (contenido textual)
3. ✅ **Estructura del proyecto** (organización)
4. ⚠️ **Requiere Java 8/11** para funcionar correctamente

El reporte HTML de Serenity es la mejor forma de visualizar los escenarios de prueba de manera gráfica e interactiva.
