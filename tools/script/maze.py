import sys
import random

width = int(sys.argv[1])
height = int(sys.argv[2])
if len(sys.argv)>3:
    seed = int(sys.argv[3])
else:
    seed = random.randint(0,99999)

grid = [[0 for col in range(width)] for row in range(height)]

N, S, E, W = 1, 2, 4, 8
DX = {E: 1, W: -1, N: 0, S: 0}
DY = {E: 0, W: 0, N: -1, S: 1}
OPPOSITE = {E: W, W: E, N: S, S: N}
random.seed(seed)
def carve_passages_from(cx, cy, grid):
    directions = [N, S, E, W]
    random.shuffle(directions)
    for direction in directions:
        nx, ny = cx + DX[direction], cy + DY[direction]

        if (ny in range(0, height)) and (nx in range(0, width)) and (grid[ny][nx] == 0):
            grid[cy][cx] |= direction
            grid[ny][nx] |= OPPOSITE[direction]
            carve_passages_from(nx, ny, grid)


carve_passages_from(0, 0, grid)

print grid

print " " + "_" * (width * 2 - 1)
for y in range(height):
    out="|"
    for x in range(width):
        if grid[y][x] & S != 0:
            out+= " "
        else:
            out+= "_"
        if grid[y][x] & E != 0:
            if (((grid[y][x] | grid[y][x+1]) & S != 0)):
                out+= " "
            else:
                out+= "_"
        else:
            out+= "|"
    print out


