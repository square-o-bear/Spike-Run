def sp() : Unit = {
    kartinka1.setPosition(kartinka1_x, kartinka1_y)
    kaktus1.setPosition(kaktus1_x, kaktus1_y)
    kaktus2.setPosition(kaktus2_x, kaktus2_y)
    kaktus3.setPosition(kaktus3_x, kaktus3_y)
    kaktus4.setPosition(kaktus4_x, kaktus4_y)
    kaktus5.setPosition(kaktus5_x, kaktus5_y)
    kaktus6.setPosition(kaktus6_x, kaktus6_y)
    kaktus7.setPosition(kaktus7_x, kaktus7_y)
    kaktus8.setPosition(kaktus8_x, kaktus8_y)
    zel1.setPosition(zel1_x, zel1_y)
}
def restart() : Unit = {
    println("TOPpoint : "+TOPpoint)
    ded = true
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
    kaktus5_x = random(kartinka1_x-100, kartinka1_x+100)
    kaktus5_y = random(-240, -260)
    kaktus6_x = random(kartinka1_x-100, kartinka1_x+100)
    kaktus6_y = random(-240, -260)
    kaktus7_x = random(260, 240)
    kaktus7_y = random(kartinka1_y-100, kartinka1_y+100)
    kaktus8_x = random(260, 240)
    kaktus8_y = random(kartinka1_y-100, kartinka1_y+100)
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

clear
cleari
println("==-- создатели --==")
println("Михаилу Ушакову - программист и дизайнер")
println("Ване Денисову - программист")
println("Вова Уласевич - создатель идей")
println("Демиду Большакову - дезайнер")
println("Ссылка на гид хаб с игрой https://github.com/square-o-bear/Spike-Run")
println("==-- --==")
println("Версия : 0_0_3 | Язык програмирования kojo")
println("Управление на клавеши :")
println("A - влево  D - вправо")
println("S - вниз   W - вверх")
println("R - рестарт")

var ded = true
var hp = 3
var point = 0
var TOPpoint = 0
var w = 10
var fon = Picture.image("fon.jpeg")
fon.draw()
fon.setPosition(-1000, -1000)
fon.scale(10)
var log = Picture.image("log.png")
log.draw()
log.scale(4)
log.setPosition(-30, -30)
var z = readInt("скорость кактусов")
log.setPosition(0, 1000)
var zel1_x = random(-250, 250)
var zel1_y = random(-250, 250)
var zel1 = Picture.image("zel.png")
zel1.draw()
zel1.scale(0.2)
zel1.setPosition(zel1_x, zel1_y)
var kartinka1_x = 0
var kartinka1_y = 0
var kartinka1 = Picture.image("pers_vl.png")
kartinka1.draw()
kartinka1.scale(2.7)
kartinka1.setPosition(kartinka1_x, kartinka1_y)
var scallKaktus = 0.23
var kaktusTextur = "kaktus.png"
var kaktus1_x = random(kartinka1_x-100, kartinka1_x+100)
var kaktus1_y = random(240, 260)
var kaktus1 = Picture.image(kaktusTextur)
kaktus1.draw()
kaktus1.setPosition(kaktus1_x, kaktus1_y)
kaktus1.scale(scallKaktus)
kaktus1.rotate(180)
var kaktus2_x = random(kartinka1_x-100, kartinka1_x+100)
var kaktus2_y = random(240, 260)
var kaktus2 = Picture.image(kaktusTextur)
kaktus2.draw()
kaktus2.setPosition(kaktus2_x, kaktus2_y)
kaktus2.scale(scallKaktus)
kaktus2.rotate(180)
var kaktus3_x = random(-260, -240)
var kaktus3_y = random(kartinka1_y-100, kartinka1_y+100)
var kaktus3 = Picture.image(kaktusTextur)
kaktus3.draw()
kaktus3.scale(scallKaktus)
kaktus3.setPosition(kaktus3_x, kaktus3_y)
kaktus3.rotate(270)
var kaktus4_x = random(-260, -240)
var kaktus4_y = random(kartinka1_y-100, kartinka1_y+100)
var kaktus4 = Picture.image(kaktusTextur)
kaktus4.draw()
kaktus4.scale(scallKaktus)
kaktus4.setPosition(kaktus4_x, kaktus4_y)
kaktus4.rotate(270)
var kaktus5_x = random(kartinka1_x-100, kartinka1_x+100)
var kaktus5_y = random(-240, -260)
var kaktus5 = Picture.image(kaktusTextur)
kaktus5.draw()
kaktus5.setPosition(kaktus5_x, kaktus5_y)
kaktus5.scale(scallKaktus)
var kaktus6_x = random(kartinka1_x-100, kartinka1_x+100)
var kaktus6_y = random(-240, -260)
var kaktus6 = Picture.image(kaktusTextur)
kaktus6.draw()
kaktus6.setPosition(kaktus6_x, kaktus6_y)
kaktus6.scale(scallKaktus)
var kaktus7_x = random(260, 240)
var kaktus7_y = random(kartinka1_y-100, kartinka1_y+100)
var kaktus7 = Picture.image(kaktusTextur)
kaktus7.draw()
kaktus7.scale(scallKaktus)
kaktus7.setPosition(kaktus7_x, kaktus7_y)
kaktus7.rotate(90)
var kaktus8_x = random(260, 240)
var kaktus8_y = random(kartinka1_y-100, kartinka1_y+100)
var kaktus8 = Picture.image(kaktusTextur)
kaktus8.draw()
kaktus8.scale(scallKaktus)
kaktus8.setPosition(kaktus8_x, kaktus8_y)
kaktus8.rotate(90)
var pause = true
var ach1 = true
var ach2 = true

println("==-- --==")
println("hp : "+hp)
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
//    case Kc.VK_X =>
//        stopAnimate()
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
    if (kaktus5_y >= 300) {
        kaktus5_x = random(kartinka1_x-100, kartinka1_x+100)
        kaktus5_y = random(-240, -260)
        point += 1
        println("point : "+point)
    }
    if (kaktus6_y >= 300) {
        kaktus6_x = random(kartinka1_x-100, kartinka1_x+100)
        kaktus6_y = random(-240, -260)
        point += 1
        println("point : "+point)
    }
    if (kaktus7_x <= -300) {
        kaktus7_x = random(260, 240)
        kaktus7_y = random(kartinka1_y-100, kartinka1_y+100)
        point += 1
        println("point : "+point)
    }
    if (kaktus8_x <= -300) {
        kaktus8_x = random(260, 240)
        kaktus8_y = random(kartinka1_y-100, kartinka1_y+100)
        point += 1
        println("point : "+point)
    }
    if (ded) {
        kaktus1_y -= z
        kaktus2_y -= z
        kaktus3_x += z
        kaktus4_x += z
        kaktus5_y += z
        kaktus6_y += z
        kaktus7_x -= z
        kaktus8_x -= z
    }
    if (kartinka1.intersects(zel1)) {
        zel1_funtion()
    }
    
    if (TOPpoint < point) {
        TOPpoint = point
    }
    sp()
    if (point >= 64 && ach1) {
        println("ДОСТИЖЕНИЕ: Стак Процентов (соберите 64 бала)")
        ach1 = false
    }
    if (kartinka1.intersects(kaktus1) || kartinka1.intersects(kaktus2) || kartinka1.intersects(kaktus3) || kartinka1.intersects(kaktus4) || kartinka1.intersects(kaktus5) || kartinka1.intersects(kaktus6) || kartinka1.intersects(kaktus7) || kartinka1.intersects(kaktus8)) {
        hp -= 1
        if (hp < 1) {
            println("==-- --==")
            point = 0
            hp = 3
            if (ach2) {
                println("ДОСТИЖЕНИЕ: Не Большая Царапена (умрите)")
                ach2 = false
            }
        }
        else {
            println("Ослалось "+hp+": hp")
        }
        
        restart()
    }
}
/* 
    ЧТО МОЖНО ОЖИДАТЬ В СЛЕДУЮЩЕЙ ВЕРСИИ
1)
    ДОБАВЛЕННО В ЭТОЙ ВЕРСИИ
  Версия A
1) обновленены:
    a. зелье
*/
