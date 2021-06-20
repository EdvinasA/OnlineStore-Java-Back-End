
insert into PRODUCT (ID, TITLE, IMAGE_URL , DESCRIPTION, PRICE, TYPE)

VALUES (1, 'Dell XP 15266','assets/images/unnamed1.png', '512 SSD PCIe  USB 3.2  Thunderbolt WiFi 802.11AX', 966.66, 'COMPUTER'),

    (2, 'Razor XP 55565','assets/images/unnamed2.png','Intel Iris X Graphics  Windows 10', 565.66, 'COMPUTER'),

    (3, 'Asus ZenBook','assets/images/unnamed3.png','UX325EA-KG250T 13.3 FullHD OLED Intel Core i5-1135G7 iki 4.2Ghz 8GB RAM', 190, 'COMPUTER'),

    (4, 'Lenovo Legion 5 ','assets/images/unnamed4.png'   ,'FullHD IPS 120Hz AMD Ryzen 7 4800H iki 4.2Ghz', 220, 'COMPUTER'),

    (5, 'Lenovo Legion 5','assets/images/unnamed5.png'   ,'16GB 3200Mhz RAM 512Gb SSD PCIe GeForce GTX 1660Ti 6Gb',300 , 'COMPUTER'),

    (6, 'Acer ConceptD 9 Pro','assets/images/unnamed6.png'   ,'CN917-71P-96BK 17,3 Ultra HD IPS Touch, Intel i9-9980HK, 32GB RAM', 256.5, 'COMPUTER'),

    (7, 'Dell Precision','assets/images/unnamed7.png'   ,'3551 1000547557636', 159, 'COMPUTER'),

    (8, 'Apple MacBook Pro 13.3','assets/images/unnamed8.png'   ,'QC i5 2.0GHz 16GB 512GB Intel Iris Plus Space Gray INT 2020', 20.00, 'COMPUTER'),

    (9, 'HP 14-dv0004nw ','assets/images/unnamed9.png'   , 'i5-1135G7 8 512 W10 Iris', 199, 'COMPUTER'),

    (10, 'HP 14s-fq07','assets/images/unnamed10.png'   , '10nd 3020E/4/64/W10S 21W17EA', 233, 'COMPUTER'),

    (11, 'Lenovo Y25-25','assets/images/unnamed11.png'   , '24.5" FullHD IPS / 1ms / 240Hz / HDMI / DisplayPort / 99% sRGB / 4x USB 3.2 / 3 metų garantija / AMD FreeSync Premium / G-SYNC Compatible', 20.00, 'MONITOR'),

    (12, 'LG 65UH5F-H 65','assets/images/unnamed12.png'   , 'Landscape/Portrait, 24/7, 178 °, 8 ms, 178 °, 3840 x 2160 pikselių, 500 cd/m² ', 1458.16, 'MONITOR'),

    (13, 'HP OMEN X 27','assets/images/unnamed13.png'   , '69 cm (27 col.), LED, WQHD, 240 Hz, 1 ms, AMD FreeSync 2, HDR, USB-Hub, DisplayPort', 513.64, 'MONITOR'),

    (14, 'Dell P2719H 210-APXF','assets/images/unnamed14.png'   , '27", IPS/PLS, FullHD 1920x1080, DisplayPort, HDMI, VGA', 219.05, 'MONITOR'),

    (15, 'Xiaomi Monitorius Mi 24','assets/images/unnamed15.png'   , '1C 24 ", IPS, FHD, 1920 x 1080, 16:9, 6 ms, 250 cd/m²', 125.75, 'MONITOR'),

    (16, 'Samsung Odyssey C34G55TWWU','assets/images/unnamed16.png'   , '86 cm (34 col.), LED, Curved, VA, UWQHD, 165Hz, 1ms, FreeSync Premium, DP, HDMI', 495.14, 'MONITOR'),

    (17, 'Philips Gaming monitor 242E1GAEZ','assets/images/unnamed17.png'   , '23.8 inch (60.5 cm), FHD, 1920 x 1080 pikselių, VA, 16:9, Juodas/Dark Chrome, 4 ms, 350 cd/m², Audio out, W-LED system', 167.00, 'MONITOR'),

    (18, 'SAMSUNG LC34G55TWWR','assets/images/unnamed18.png'   ,'Odyssey G5 34inch 21:9 UWQHD 3440x1440 250cm/m2 3000:1 1ms 165Hz 1.000R DP HDMI', 458.00, 'MONITOR'),

    (19, 'Samsung S27AM504NR','assets/images/unnamed19.png'   , 'Smart Monitor 16:9 8ms 2xHDMI VESA Speaker Full HD', 284.00, 'MONITOR'),

    (20, 'Samsung S27AM504NR','assets/images/unnamed19.png'   , 'Smart Monitor 16:9 8ms 2xHDMI VESA Speaker Full HD', 284.00, 'MONITOR'),

    (21, 'RAM Kingston HyperX ','assets/images/unnamed20.png'   , 'Fury Black HX432C16FB4K2/32 DDR4 32 GB ', 181.00, 'OTHERS'),

    (22, 'RAM Crucial','assets/images/unnamed21.png'   , 'CT8G4SFS824A DDR4 (SO-DIMM) 8 GB', 48.95, 'OTHERS'),

    (23, 'RAM Patriot Signature','assets/images/unnamed22.png'   , 'PSP416G26662H1 DDR4 16 GB ', 75.00, 'OTHERS'),

    (24, 'Wi-Fi adapter','assets/images/unnamed23.png'   ,'USB, b/g/n 300Mbit/s, TP-LINK', 15.00, 'OTHERS'),

    (25, 'Adapteris 2.5",3.5"','assets/images/unnamed24.png'   , 'USB 2.0 - SATA, IDE', 14.90, 'OTHERS'),

    (26, 'Gembird adapter HDMI-A(M)','assets/images/unnamed25.png'   , 'VGA (F) + audio, on cable, black', 5.49, 'OTHERS'),

    (27, 'USB KINGSTON DataTraveler','assets/images/unnamed26.png'   , 'DTI G4, 128 GB, USB 3.0 ', 20.00, 'OTHERS'),

    (28, 'USB KINGSTON DataTraveler','assets/images/unnamed26.png'   , 'DTI G4, 128 GB, USB 3.0 ', 20.00, 'OTHERS'),

    (29, 'Philips USB 3.0','assets/images/unnamed27.png'   , 'Flash Drive Snow Edition (Brown) 128GB ', 17.49, 'OTHERS');



insert into product_quantity (ID, PRODUCT_ID, QUANTITY, DATE)
values (1, 1, 20.00, '2021-05-31');

insert into cart (ID, PRODUCT_ID, QUANTITY)
values (1, 1, 3),
       (2, 2, 5);

insert into purchase_order (ID, USER_NAME, USER_SURNAME, DELIVERY_ADDRESS, ORDER_DATE)
values (1, 'Jonas', 'Jonaitis', 'Aguonų g. 15, Kaunas', '2021-06-02'),
       (2, 'Jonas', 'Jonaitis', 'Aguonų g. 15, Kaunas', '2021-06-10'),
       (3, 'Jonas', 'Jonaitis', 'Aguonų g. 15, Kaunas', '2021-06-13');

insert into USERS (ID,PASSWORD, USER_NAME)
values (1, 'admin', 'admin'),
       (2, 'user', 'user');

insert into purchase_order_line(ID, PURCHASE_ORDER_ID, PRODUCT_ID, QUANTITY)
values (1, 1, 1, 1.0),
       (2, 1, 2, 2.0),
       (3, 1, 3, 6.0),
       (4, 2, 4, 1.0),
       (5, 2, 5, 2.0),
       (6, 2, 6, 1.0),
       (7, 3, 1, 5.0),
       (8, 3, 6, 1.0);



