// Funktion zum Zeichnen eines 3D-wirkenden Tetris-Blocks
function drawBlock(ctx, x, y, size, color) {
    // 1. Die flache Grundfarbe des Blocks zeichnen
    ctx.fillStyle = color;
    ctx.fillRect(x, y, size, size);

    // 2. Lichtkante (oben und links)
    // Weiß mit 40% Deckkraft hellt die Grundfarbe darunter auf
    ctx.fillStyle = "rgba(255, 255, 255, 0.4)"; 
    ctx.fillRect(x, y, size, 4); // Obere Kante
    ctx.fillRect(x, y, 4, size); // Linke Kante

    // 3. Schattenkante (unten und rechts)
    // Schwarz mit 40% Deckkraft dunkelt die Grundfarbe darunter ab
    ctx.fillStyle = "rgba(0, 0, 0, 0.4)"; 
    ctx.fillRect(x, y + size - 4, size, 4); // Untere Kante
    ctx.fillRect(x + size - 4, y, 4, size); // Rechte Kante

    // 4. Ein feiner schwarzer Rahmen für saubere Abgrenzung der Blöcke
    ctx.strokeStyle = "rgba(0, 0, 0, 0.8)";
    ctx.lineWidth = 1;
    ctx.strokeRect(x, y, size, size);
}