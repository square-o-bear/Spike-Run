def sp() : Unit = {
    kartinka1.setPosition(kartinka1_x, kartinka1_y)
    kaktus1.setPosition(kaktus1_x, kaktus1_y)
    kaktus2.setPosition(kaktus2_x, kaktus2_y)
    kaktus3.setPosition(kaktus3_x, kaktus3_y)
    kaktus4.setPosition(kaktus4_x, kaktus4_y)
    zel1.setPosition(zel1_x, zel1_y)
}
def restart() : Unit = {
    println("==-- --==")
    println("TOPpoint : "+TOPpoint)
    ded = true
    point = 0
    w = 10
    kartinka1_x = 0
    kartinka1_y = 0
    kaktus1_x = random(kartinka1_x-100, kartinka1_x+100)
    kaktus1_y = random(280, 320)
    kaktus2_x = random(kartinka1_x-100, kartinka1_x+100)
    kaktus2_y = random(280, 320)
    kaktus3_x = random(-260, -240)
    kaktus3_y = random(kartinka1_y-100, kartinka1_y+100)
    kaktus4_x = random(-260, -240)
    kaktus4_y = random(kartinka1_y-100, kartinka1_y+100)
    zel1_x = random(-250, 250)
    zel1_y = random(-250, 250)
    sp()
}
def zel1_funtion () : Unit = {
    var zelrandom = random(1,3)
    if (zelrandom == 1) {
        w = 25
    }
    else if (zelrandom == 2) {
        point += 1
        println("point : "+point)
    }
    zel1_x = random(-250, 250)
    zel1_y = random(-250, 250)
    sp()
}
cleari
println("Версия : 0_0_2")
var ded = true
var point = 0
var TOPpoint = 0
var z = readInt("скорость кактусов")
var w = 10
var zel1_x = random(-250, 250)
var zel1_y = random(-250, 250)
var zel1 = Picture.image("zel1.jpeg")
zel1.draw()
zel1.scale(0.2)
zel1.setPosition(zel1_x, zel1_y)
var kartinka1_x = 0
var kartinka1_y = 0
var kartinka1 = Picture.image("pers.jpeg")
kartinka1.draw()
kartinka1.scale(0.3)
kartinka1.setPosition(kartinka1_x, kartinka1_y)
var kaktus1_x = random(kartinka1_x-100, kartinka1_x+100)
var kaktus1_y = random(240, 260)
var kaktus1 = Picture.image("kaktus.jpeg")
kaktus1.draw()
kaktus1.setPosition(kaktus1_x, kaktus1_y)
kaktus1.scale(0.25)
kaktus1.rotate(180)
var kaktus2_x = random(kartinka1_x-100, kartinka1_x+100)
var kaktus2_y = random(240, 260)
var kaktus2 = Picture.image("kaktus.jpeg")
kaktus2.draw()
kaktus2.setPosition(kaktus2_x, kaktus2_y)
kaktus2.scale(0.25)
kaktus2.rotate(180)
var kaktus3_x = random(-260, -240)
var kaktus3_y = random(kartinka1_y-100, kartinka1_y+100)
var kaktus3 = Picture.image("kaktus.jpeg")
kaktus3.draw()
kaktus3.scale(0.25)
kaktus3.setPosition(kaktus3_x, kaktus3_y)
kaktus3.rotate(270)
var kaktus4_x = random(-260, -240)
var kaktus4_y = random(kartinka1_y-100, kartinka1_y+100)
var kaktus4 = Picture.image("kaktus.jpeg")
kaktus4.draw()
kaktus4.scale(0.25)
kaktus4.setPosition(kaktus4_x, kaktus4_y)
kaktus4.rotate(270)
animate {
    onKeyPress {
    case Kc.VK_A =>
        kartinka1_x -= w
    case Kc.VK_D =>
        kartinka1_x += w
    case Kc.VK_S =>
        kartinka1_y -= w
    case Kc.VK_W =>
        kartinka1_y += w
    case Kc.VK_R =>
        restart()
    }
    if (kartinka1_x >= 300) {
        kartinka1_x *= (-1)
    }
    if (kartinka1_x <= -300) {
        kartinka1_x *= (-1)
    }
    if (kartinka1_y >= 310) {
        kartinka1_y *= (-1)
    }
    if (kartinka1_y <= -310) {
        kartinka1_y *= (-1)
    }
    if (kaktus1_y <= -300) {
        kaktus1_x = random(kartinka1_x-100, kartinka1_x+100)
        kaktus1_y = random(280, 320)
        point += 1
        println("point : "+point)
    }
    if (kaktus2_y <= -300) {
        kaktus2_x = random(kartinka1_x-100, kartinka1_x+100)
        kaktus2_y = random(280, 320)
        point += 1
        println("point : "+point)
    }
    if (kaktus3_x >= 300) {
        kaktus3_x = random(-260, -240)
        kaktus3_y = random(kartinka1_y-100, kartinka1_y+100)
        point += 1
        println("point : "+point)
    }
    if (kaktus4_x >= 300) {
        kaktus4_x = random(-260, -240)
        kaktus4_y = random(kartinka1_y-100, kartinka1_y+100)
        point += 1
        println("point : "+point)
    }
    if (ded) {
        kaktus1_y -= z
        kaktus2_y -= z
        kaktus3_x += z
        kaktus4_x += z
    }
    if (kartinka1.intersects(zel1)) {
        zel1_funtion()
    }
    if (TOPpoint < point) {
        TOPpoint = point
    }
    sp()
    if (kartinka1.intersects(kaktus1) || kartinka1.intersects(kaktus2) || kartinka1.intersects(kaktus3) || kartinka1.intersects(kaktus4)) {
        restart()
    }
}
/* 
    ЧТО МОЖНО ОЖИДАТЬ В СЛЕДУЮЩЕЙ ВЕРСИИ
0) Добавить ещё 4 кактуса
    ДОБАВЛЕННО В ЭТОЙ ВЕРСИИ
1) Добавлены балы
2) Лучший бал в игре до перезапуска
3) Зелье (скорость/балы/ничего)
4) Улучший текстурку кактуса
*/